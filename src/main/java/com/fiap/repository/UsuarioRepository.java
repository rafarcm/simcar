package com.fiap.repository;

import com.fiap.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by logonrm on 25/03/2017.
 */
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String> {
}
