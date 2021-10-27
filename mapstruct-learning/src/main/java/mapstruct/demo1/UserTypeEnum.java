package mapstruct.demo1;

/**
 * @author ryland
 */

public enum UserTypeEnum {

    // Java 开发工程师
    Java("000", "Java developer"),

    // 数据库管理员
    DB("001", "DBA"),

    // Linux 运维员
    LINUX("002", "Linux Ops");

    UserTypeEnum(String value, String title) {
    }

}
