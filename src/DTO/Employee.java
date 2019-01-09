/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Hifumin
 */
public class Employee {

    private String MaNV;
    private String MaCC;
    private String Gioitinh;
    private String CMND;
    private String NgayCapCMND;
    private String NoiCapCMND;
    private String HoTen;
    private String HoDem;
    private String Ten;
    private String NgaySinh;
    private String NoiSinh;
    private String NguyenQuan;
    private String HoChieu;
    private String NgayCapHC;
    private String NgayHetHC;
    private String NoiCapHC;
    private String TinhTrangHonNhan;
    private String ThanhPhanGD;
    private String DanToc;
    private String TonGiao;
    private String QuocTich;
    private String VanHoa;
    private String DaoTao;
    private String Truong;
    private String Khoa;
    private String ChuyenNganh;
    private int Nam;
    private String Loai;
    private String NgheNghiep;
    private String img;

    public Employee() {
    }

    public Employee(String MaNV, String MaCC, String Gioitinh, String CMND, String NgayCapCMND, String NoiCapCMND, String HoTen, String HoDem, String Ten, String NgaySinh, String NoiSinh, String NguyenQuan, String HoChieu, String NgayCapHC, String NgayHetHC, String NoiCapHC, String TinhTrangHonNhan, String ThanhPhanGD, String DanToc, String TonGiao, String QuocTich, String VanHoa, String DaoTao, String Truong, String Khoa, String ChuyenNganh, int Nam, String Loai, String NgheNghiep, String img) {
        this.MaNV = MaNV;
        this.MaCC = MaCC;
        this.Gioitinh = Gioitinh;
        this.CMND = CMND;
        this.NgayCapCMND = NgayCapCMND;
        this.NoiCapCMND = NoiCapCMND;
        this.HoTen = HoTen;
        this.HoDem = HoDem;
        this.Ten = Ten;
        this.NgaySinh = NgaySinh;
        this.NoiSinh = NoiSinh;
        this.NguyenQuan = NguyenQuan;
        this.HoChieu = HoChieu;
        this.NgayCapHC = NgayCapHC;
        this.NgayHetHC = NgayHetHC;
        this.NoiCapHC = NoiCapHC;
        this.TinhTrangHonNhan = TinhTrangHonNhan;
        this.ThanhPhanGD = ThanhPhanGD;
        this.DanToc = DanToc;
        this.TonGiao = TonGiao;
        this.QuocTich = QuocTich;
        this.VanHoa = VanHoa;
        this.DaoTao = DaoTao;
        this.Truong = Truong;
        this.Khoa = Khoa;
        this.ChuyenNganh = ChuyenNganh;
        this.Nam = Nam;
        this.Loai = Loai;
        this.NgheNghiep = NgheNghiep;
        this.img = img;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaCC() {
        return MaCC;
    }

    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getNgayCapCMND() {
        return NgayCapCMND;
    }

    public void setNgayCapCMND(String NgayCapCMND) {
        this.NgayCapCMND = NgayCapCMND;
    }

    public String getNoiCapCMND() {
        return NoiCapCMND;
    }

    public void setNoiCapCMND(String NoiCapCMND) {
        this.NoiCapCMND = NoiCapCMND;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getHoDem() {
        return HoDem;
    }

    public void setHoDem(String HoDem) {
        this.HoDem = HoDem;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public String getNguyenQuan() {
        return NguyenQuan;
    }

    public void setNguyenQuan(String NguyenQuan) {
        this.NguyenQuan = NguyenQuan;
    }

    public String getHoChieu() {
        return HoChieu;
    }

    public void setHoChieu(String HoChieu) {
        this.HoChieu = HoChieu;
    }

    public String getNgayCapHC() {
        return NgayCapHC;
    }

    public void setNgayCapHC(String NgayCapHC) {
        this.NgayCapHC = NgayCapHC;
    }

    public String getNgayHetHC() {
        return NgayHetHC;
    }

    public void setNgayHetHC(String NgayHetHC) {
        this.NgayHetHC = NgayHetHC;
    }

    public String getNoiCapHC() {
        return NoiCapHC;
    }

    public void setNoiCapHC(String NoiCapHC) {
        this.NoiCapHC = NoiCapHC;
    }

    public String getTinhTrangHonNhan() {
        return TinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(String TinhTrangHonNhan) {
        this.TinhTrangHonNhan = TinhTrangHonNhan;
    }

    public String getThanhPhanGD() {
        return ThanhPhanGD;
    }

    public void setThanhPhanGD(String ThanhPhanGD) {
        this.ThanhPhanGD = ThanhPhanGD;
    }

    public String getDanToc() {
        return DanToc;
    }

    public void setDanToc(String DanToc) {
        this.DanToc = DanToc;
    }

    public String getTonGiao() {
        return TonGiao;
    }

    public void setTonGiao(String TonGiao) {
        this.TonGiao = TonGiao;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }

    public String getVanHoa() {
        return VanHoa;
    }

    public void setVanHoa(String VanHoa) {
        this.VanHoa = VanHoa;
    }

    public String getDaoTao() {
        return DaoTao;
    }

    public void setDaoTao(String DaoTao) {
        this.DaoTao = DaoTao;
    }

    public String getTruong() {
        return Truong;
    }

    public void setTruong(String Truong) {
        this.Truong = Truong;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String ChuyenNganh) {
        this.ChuyenNganh = ChuyenNganh;
    }

    public int getNam() {
        return Nam;
    }

    public void setNam(int Nam) {
        this.Nam = Nam;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getNgheNghiep() {
        return NgheNghiep;
    }

    public void setNgheNghiep(String NgheNghiep) {
        this.NgheNghiep = NgheNghiep;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


}
