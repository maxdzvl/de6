/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.EmployeeDAL;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author manng
 */
public class EmployeeBLL {

    EmployeeDAL dal = new EmployeeDAL();

    public ArrayList<Employee> ReadEmployeeBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readEmployee();
        return listEmployee;
    }

    public ArrayList<Dantoc> readDantoc() {
        ArrayList<Dantoc> listdt = new ArrayList<>();
        listdt = dal.readDantoc();
        return listdt;
    }

    public ArrayList<Tongiao> readTongiao() {
        ArrayList<Tongiao> listtg = new ArrayList<>();
        listtg = dal.readTongiao();
        return listtg;
    }

    public ArrayList<Giadinh> readGiadinh() {
        ArrayList<Giadinh> listgd = new ArrayList<>();
        listgd = dal.readGiadinh();
        return listgd;
    }

    public ArrayList<Quoctich> readQuoctich() {
        ArrayList<Quoctich> listqt = new ArrayList<>();
        listqt = dal.readQuoctich();
        return listqt;
    }

    public ArrayList<Honnhan> readHonnhan() {
        ArrayList<Honnhan> listhn = new ArrayList<>();
        listhn = dal.readHonnhan();
        return listhn;
    }

    public ArrayList<Tinhthanh> readTinhthanh() {
        ArrayList<Tinhthanh> listtt = new ArrayList<>();
        listtt = dal.readTinhthanh();
        return listtt;
    }

    public ArrayList<Nguyenquan> readNguyenquan() {
        ArrayList<Nguyenquan> listnq = new ArrayList<>();
        listnq = dal.readNguyenquan();
        return listnq;
    }

    public ArrayList<Trinhdo> readTrinhdo() {
        ArrayList<Trinhdo> listtd = new ArrayList<>();
        listtd = dal.readTrinhdo();
        return listtd;
    }

    public ArrayList<Truong> readTruong() {
        ArrayList<Truong> listtr = new ArrayList<>();
        listtr = dal.readTruong();
        return listtr;
    }

    public ArrayList<Khoa> readKhoa() {
        ArrayList<Khoa> listk = new ArrayList<>();
        listk = dal.readKhoa();
        return listk;
    }

    public ArrayList<Nganh> readNganh() {
        ArrayList<Nganh> listng = new ArrayList<>();
        listng = dal.readNganh();
        return listng;
    }

    public ArrayList<Nghe> readNghe() {
        ArrayList<Nghe> listn = new ArrayList<>();
        listn = dal.readNghe();
        return listn;
    }

    public ArrayList<Loai> readLoai() {
        ArrayList<Loai> listl = new ArrayList<>();
        listl = dal.readLoai();
        return listl;
    }

    public ArrayList<Gioitinh> readGioitinh() {
        ArrayList<Gioitinh> listGioiTinh = new ArrayList<>();
        listGioiTinh = dal.readGioitinh();
        return listGioiTinh;
    }

    public void AddNewEmployeeDAL(Employee emp) {
        dal.addNewDAL(emp);
    }

//    public void EditEmployeeDAL(Employee employeeModel) {
//        try {
//            dal.EditEmployee(employeeModel);
//        } catch (SQLException ex) {
//            Logger.getLogger(EmployeeBLL.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//    }
    public void DeleteEmployeeDAL(String MaNV) throws Exception {
        if (Integer.parseInt(MaNV) > 1) {
            dal.deleteDAL(MaNV);
        } else {
            throw new Exception("MaNV not valid");
        }
    }

}
