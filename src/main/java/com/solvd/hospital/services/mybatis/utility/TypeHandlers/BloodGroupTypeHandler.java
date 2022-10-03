package com.solvd.hospital.services.mybatis.utility.TypeHandlers;

import com.solvd.hospital.models.enums.BloodGroup;
import org.apache.ibatis.type.BaseTypeHandler;

import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BloodGroupTypeHandler extends BaseTypeHandler<BloodGroup> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, BloodGroup parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setString(i, parameter.getValue());
    }

    @Override
    public BloodGroup getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return BloodGroup.findByValue(rs.getString(columnName));
    }

    @Override
    public BloodGroup getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return BloodGroup.findByValue(rs.getString(columnIndex));
    }

    @Override
    public BloodGroup getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return BloodGroup.findByValue(cs.getString(columnIndex));
    }
}
