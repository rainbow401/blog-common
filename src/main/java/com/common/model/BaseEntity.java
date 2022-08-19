package com.common.model;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    private Long createBy;

    private LocalDateTime createTime;

    private Long updateBy;

    private LocalDateTime updateTime;

    @TableLogic(value = "0", delval = "1")
    private Boolean deleted;
}
