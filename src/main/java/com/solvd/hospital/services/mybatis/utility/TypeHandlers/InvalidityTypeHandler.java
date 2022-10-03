package com.solvd.hospital.services.mybatis.utility.TypeHandlers;

import com.solvd.hospital.models.enums.Gender;
import com.solvd.hospital.models.enums.Invalidity;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InvalidityTypeHandler extends BaseTypeHandler<Invalidity> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Invalidity parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setString(i, parameter.getValue());
    }

    @Override
    public Invalidity getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return Invalidity.findByValue(rs.getString(columnName));
    }

    @Override
    public Invalidity getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return Invalidity.findByValue(rs.getString(columnIndex));
    }

    @Override
    public Invalidity getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return Invalidity.findByValue(cs.getString(columnIndex));
    }
}