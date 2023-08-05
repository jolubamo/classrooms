package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IUserRepository;


@Service
public class LoginServiceImpl implements UserDetailsService{

    @Autowired
    private IUserRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {


        com.example.demo.model.User usuario = usuarioRepository.searchUserEmail(email);
        
        System.out.println(usuario);

        boolean estado = true;

        List<GrantedAuthority> lstRole = buscarRolePorUsuario(usuario.getEmail());

        //List<GrantedAuthority> lstRole = buscarRolePorUsuario(username);


        return new User(email, usuario.getPassword(), estado, true, true, true, lstRole);
    }

    private List<GrantedAuthority> buscarRolePorUsuario(String usuario) {

        List<String> lstStrRole = usuarioRepository.searchRolesForUser(usuario);
        System.out.println(lstStrRole);

        List<GrantedAuthority> lstGraRole=new ArrayList<GrantedAuthority>();

        for(String role:lstStrRole) {
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+role.toUpperCase());
            lstGraRole.add(authority);
        }

        return lstGraRole;

    }

}
