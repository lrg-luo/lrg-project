package org.example.springbootdemoproject.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: pupu
 * @CreateDate: 2025/5/23 18:15
 * @UpdateUser:
 * @UpdateDate: 2025/5/23 18:15
 * @UpdateRemark:
 * @Version: 1.0
 */
@Service
public class WebService {


    public List<String> getList() {
        return List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    }
}
