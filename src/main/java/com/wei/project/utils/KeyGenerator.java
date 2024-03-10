package com.wei.project.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class KeyGenerator {

    /**
     * 生成 ak
     *
     * @return
     */

    public static String generateAccessKey() {
        // 生成一个UUID
        UUID uuid = UUID.randomUUID();
        // 将UUID转换为字符串
        String uuidString = uuid.toString();
        // 可以通过哈希或编码增加复杂性（可选）
        // 这里我们选择简单的Base64编码
        return Base64.getEncoder().encodeToString(uuidString.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * 生成 sk
     *
     * @return
     */
    public static String generateSecretKey() {
        // 生成一个UUID
        UUID uuid = UUID.randomUUID();
        // 将UUID转换为字符串
        String uuidString = uuid.toString();
        // 可以通过哈希或编码增加复杂性（可选）
        // 这里我们选择简单的Base64编码
        return Base64.getEncoder().encodeToString(uuidString.getBytes(StandardCharsets.UTF_8));
    }
}