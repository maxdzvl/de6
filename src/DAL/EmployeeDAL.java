/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manng
 */
public class EmployeeDAL extends Database {

    public static Connection conn = null;
    public static Statement stmt = null;

    // Get Employee
    public ArrayList<Employee> readEmployee() {

        ArrayList<Employee> emlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM nhanvien";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Employee em = new Employee();
                em.setMaNV(rs.getString("MaNV"));
                em.setMaCC(rs.getString("MaCC"));
                em.setGioitinh(rs.getString("Gioitinh"));
                em.setCMND(rs.getString("CMND"));
                em.setNgayCapCMND(rs.getString("NgayCapCMND"));
                em.setNoiCapCMND(rs.getString("NoiCapCMND"));
                em.setHoDem(rs.getString("HoDem"));
                em.setHoTen(rs.getString("HoTen"));
                em.setTen(rs.getString("Ten"));
                em.setNgaySinh(rs.getString("NgaySinh"));
                em.setNoiSinh(rs.getString("NoiSinh"));
                em.setNguyenQuan(rs.getString("NguyenQuan"));
                em.setHoChieu(rs.getString("HoChieu"));
                em.setNgayCapHC(rs.getString("NgayCapHC"));
                em.setNgayHetHC(rs.getString("NgayHetHC"));
                em.setNoiCapHC(rs.getString("NoiCapHC"));
                em.setTinhTrangHonNhan(rs.getString("TinhTrangHonNhan"));
                em.setThanhPhanGD(rs.getString("ThanhPhanGD"));
                em.setDanToc(rs.getString("DanToc"));
                em.setTonGiao(rs.getString("TonGiao"));
                em.setQuocTich(rs.getString("QuocTich"));
                em.setVanHoa(rs.getString("VanHoa"));
                em.setDaoTao(rs.getString("DaoTao"));
                em.setTruong(rs.getString("Truong"));
                em.setKhoa(rs.getString("Khoa"));
                em.setChuyenNganh(rs.getString("ChuyenNganh"));
                em.setNam(rs.getInt("Nam"));
                em.setLoai(rs.getString("Loai"));
                em.setNgheNghiep(rs.getString("NgheNghiep"));
                em.setImg(rs.getString("Img"));
                emlist.add(em);

            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return emlist;
        }
    }

    public ArrayList<Dantoc> readDantoc() {
        ArrayList<Dantoc> dtList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT Dantoc FROM dantoc";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Dantoc dt = new Dantoc();
                dt.setDantoc(rs.getString("Dantoc"));
                dtList.add(dt);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return dtList;
        }
    }

    public ArrayList<Tongiao> readTongiao() {
        ArrayList<Tongiao> tgList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT Tongiao FROM tongiao";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Tongiao tg = new Tongiao();
                tg.setTongiao(rs.getString("Tongiao"));
                tgList.add(tg);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return tgList;
        }
    }

    public ArrayList<Giadinh> readGiadinh() {
        ArrayList<Giadinh> gdList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT giadinh FROM giadinh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Giadinh gd = new Giadinh();
                gd.setGiadinh(rs.getString("giadinh"));
                gdList.add(gd);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return gdList;
        }
    }

    public ArrayList<Quoctich> readQuoctich() {
        ArrayList<Quoctich> qtList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT quoctich FROM quoctich";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Quoctich qt = new Quoctich();
                qt.setQuoctich(rs.getString("quoctich"));
                qtList.add(qt);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return qtList;
        }
    }

    public ArrayList<Honnhan> readHonnhan() {
        ArrayList<Honnhan> hnList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT tinhtranghonnhan FROM tinhtranghonnhan";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Honnhan hn = new Honnhan();
                hn.setTinhtranghonnhan(rs.getString("tinhtranghonnhan"));
                hnList.add(hn);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return hnList;
        }
    }

    public ArrayList<Tinhthanh> readTinhthanh() {
        ArrayList<Tinhthanh> ttList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT tinhthanh FROM tinhthanh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Tinhthanh tt = new Tinhthanh();
                tt.setTinhthanh(rs.getString("Tinhthanh"));
                ttList.add(tt);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return ttList;
        }
    }

    public ArrayList<Nguyenquan> readNguyenquan() {
        ArrayList<Nguyenquan> nqList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT tinhthanh FROM tinhthanh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Nguyenquan nq = new Nguyenquan();
                nq.setTinhthanh(rs.getString("Tinhthanh"));
                nqList.add(nq);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return nqList;
        }
    }

    public ArrayList<Trinhdo> readTrinhdo() {
        ArrayList<Trinhdo> tdList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT trinhdo FROM trinhdo";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Trinhdo td = new Trinhdo();
                td.setTrinhdo(rs.getString("Trinhdo"));
                tdList.add(td);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return tdList;
        }
    }

    public ArrayList<Truong> readTruong() {
        ArrayList<Truong> trList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT truong FROM truong";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Truong tr = new Truong();
                tr.setTruong(rs.getString("Truong"));
                trList.add(tr);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return trList;
        }
    }

    public ArrayList<Khoa> readKhoa() {
        ArrayList<Khoa> khList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT khoa FROM khoa";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Khoa kh = new Khoa();
                kh.setKhoa(rs.getString("Khoa"));
                khList.add(kh);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return khList;
        }
    }

    public ArrayList<Nganh> readNganh() {
        ArrayList<Nganh> ngList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT nganh FROM nganh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Nganh ng = new Nganh();
                ng.setNganh(rs.getString("Nganh"));
                ngList.add(ng);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return ngList;
        }
    }

    public ArrayList<Nghe> readNghe() {
        ArrayList<Nghe> nList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT nghe FROM nghe";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Nghe n = new Nghe();
                n.setNghe(rs.getString("Nghe"));
                nList.add(n);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return nList;
        }
    }

    public ArrayList<Loai> readLoai() {
        ArrayList<Loai> lList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT loai FROM loai";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                Loai l = new Loai();
                l.setLoai(rs.getString("Loai"));
                lList.add(l);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return lList;
        }
    }

    public ArrayList<Gioitinh> readGioitinh() {
        ArrayList<Gioitinh> gtList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql = "Select Gioitinh From gioitinh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while (rs.next()) {
                Gioitinh gT = new Gioitinh();
                gT.setGioitinh(rs.getString("gioitinh"));
                gtList.add(gT);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return gtList;
        }
    }

    public void addNewDAL(Employee emp) {

        conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String MaNV = emp.getMaNV();
            String MaCC = emp.getMaCC();
            String Hovadem = emp.getHoDem();
            String Hovaten = emp.getHoTen();
            String Ten = emp.getTen();
            String Ngaysinh = emp.getNgaySinh();
            String Gioitinh = emp.getGioitinh();
            String Noisinh = emp.getNoiSinh();
            String Nguyenquan = emp.getNguyenQuan();
//            String Thanhpho = emp.getThanhpho();
            String Cmnd = emp.getCMND();
            String Ngaycap = emp.getNgayCapCMND();
            String Noicap = emp.getNoiCapCMND();
            String Sohc = emp.getHoChieu();
            String Ngaycaphc = emp.getNgayCapHC();
            String Ngayhethan = emp.getNgayHetHC();
            String Noicaphc = emp.getNoiCapHC();
            String Honnhan = emp.getTinhTrangHonNhan();
            String Giadinh = emp.getThanhPhanGD();
            String Dantoc = emp.getDanToc();
            String Tongiao = emp.getTonGiao();
            String Quoctich = emp.getQuocTich();
            String Vanhoa = emp.getVanHoa();
            String Daotao = emp.getDaoTao();
            String Noidaotao = emp.getTruong();
            String Khoa = emp.getKhoa();
            String Nganh = emp.getChuyenNganh();
            String Nghe = emp.getNgheNghiep();
            int Namtotnghiep = emp.getNam();
            String Xeploai = emp.getLoai();
            String Hinh = emp.getImg();
            String sql = "INSERT INTO `nhanvien`( `MaNV`, `MaCC`, `HoDem`, `HoTen`, `Ten`, `NgaySinh`, `Gioitinh`, `NoiSinh`, `NguyenQuan`, `CMND`, `NgayCapCMND`, `NoiCapCMND`, `Hochieu`, `NgayCapHC`, `NgayHetHC`, `NoiCapHC`, `TinhTrangHonNhan`, `ThanhPhanGD`, `DanToc`, `TonGiao`, `QuocTich`, `VanHoa`, `DaoTao`, `Truong`, `Khoa`, `ChuyenNganh`, `Nam`, `Loai`, `NgheNghiep`,`img`) VALUES ('" + MaNV + "','" + MaCC + "','" + Hovadem + "','" + Hovaten + "','" + Ten + "','" + Ngaysinh + "','" + Gioitinh + "','" + Noisinh + "','" + Nguyenquan + "','" + Cmnd + "','" + Ngaycap + "','" + Noicap + "','" + Sohc + "','" + Ngaycaphc + "','" + Ngayhethan + "','" + Noicaphc + "','" + Honnhan + "','" + Giadinh + "','" + Dantoc + "','" + Tongiao + "','" + Quoctich + "','" + Vanhoa + "','" + Daotao + "','" + Noidaotao + "','" + Khoa + "','" + Nganh + "','" + Namtotnghiep + "','" + Xeploai + "','" + Nghe + "','" + Hinh + "')";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//      // Delete Employee 

    public void deleteDAL(String MaNV) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "DELETE FROM nhanvien WHERE MaNV =" + MaNV;
            stmt.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
        } catch (SQLException s) {
        } catch (Exception e) {
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }
    }
}
