/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import view.v_penjualan;

/**
 *
 * @author asus
 */
public interface c_penjualan {
    public void Bayar (v_penjualan vp) throws SQLException;
    public void Batal (v_penjualan vp) throws SQLException;
}
