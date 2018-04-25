package top.hejiaxuan.util.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 匿名内部接口 提供一个函数
 *
 * @param <T>
 */
interface DoInJdbc<T> {
    T execute(JdbcTemplate jdbcTemplate);
}