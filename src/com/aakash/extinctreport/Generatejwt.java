package com.aakash.extinctreport;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

public class Generatejwt {

    public PrivateKey getPrivateKey(String rsaPrivateKey) throws NoSuchAlgorithmException, InvalidKeySpecException {
        rsaPrivateKey = rsaPrivateKey.replace("-----BEGIN PRIVATE KEY-----", "");
        rsaPrivateKey = rsaPrivateKey.replace("-----END PRIVATE KEY-----", "");

        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(rsaPrivateKey));
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(keySpec);
    }

    public JwtBuilder getHMACJwtBuilder(PrivateKey privateKey) {
        try {
            Instant now = Instant.now();
            return Jwts.builder()
                    .setId(UUID.randomUUID().toString())
                    .setIssuedAt(Date.from(now))
                    .setExpiration(Date.from(now.plus(24, ChronoUnit.HOURS)))
                    .signWith(privateKey);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String getJwtTokenWithClientId(String privateKey, String clientId) {
        try {
            PrivateKey rsaPrivateKey = getPrivateKey(privateKey);
            JwtBuilder jwtBuilder = getHMACJwtBuilder(rsaPrivateKey);
            return jwtBuilder.claim("client-id", clientId).compact();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}