package br.com.alura.forum.config.security;

import br.com.alura.forum.entity.Usuario;
import io.jsonwebtoken.Jwts;
import org.springframework.security.core.Authentication;

import java.util.Date;

public class TokenService {
    public String gerarToken(Authentication authentication) {
        Usuario logado = (Usuario) authentication.getPrincipal();
        Date hoje = new Date();
        return Jwts.builder()
                .setIssuer("Api do Fórum da Alura")
                .setSubject(logado.getId().toString())
                .setIssuedAt(hoje)
                .setExpiration(exp);
    }
}
