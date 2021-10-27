package mapstruct.demo1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Ryland
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVo1 {

    private Integer id;
    private String name;
    private String createTime;
    private LocalDateTime updateTime;

}
