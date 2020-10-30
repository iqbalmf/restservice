package ac.id.sttistieni.restservice.model.pmb;

import java.io.Serializable;
import java.util.Date;

public class PmbResponse implements Serializable {
    private Long id;
    private String id_user;
    private String username;
    private String password;
    private String email;
    private String fullname;
    private String kelamin;
    private String tempatLahir;
    private Date tglLahir;
    private String ibuKandung;
    private String alamat;
    private String kodepos;
    private String notlp;
    private String lulusan;
    private String asalLulusan;
    private String asalJurusan;
    private String asalAlamatLulusan;
    private Boolean isKerja;
    private String kantorInstansi;
    private String kantorJabatan;
    private String kantorAlamat;
    private String kantorNotlp;
    private String biayaRencana;
    private String biayaSPB;
    private String biayaSPP;
    private String sumberInfo;
    private String pWawancara;
    private String pmbJurusan;
    private String pmbPerguruanTinggi;
    private Boolean isLunas;

    public PmbResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getIbuKandung() {
        return ibuKandung;
    }

    public void setIbuKandung(String ibuKandung) {
        this.ibuKandung = ibuKandung;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKodepos() {
        return kodepos;
    }

    public void setKodepos(String kodepos) {
        this.kodepos = kodepos;
    }

    public String getNotlp() {
        return notlp;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }

    public String getLulusan() {
        return lulusan;
    }

    public void setLulusan(String lulusan) {
        this.lulusan = lulusan;
    }

    public String getAsalLulusan() {
        return asalLulusan;
    }

    public void setAsalLulusan(String asalLulusan) {
        this.asalLulusan = asalLulusan;
    }

    public String getAsalJurusan() {
        return asalJurusan;
    }

    public void setAsalJurusan(String asalJurusan) {
        this.asalJurusan = asalJurusan;
    }

    public String getAsalAlamatLulusan() {
        return asalAlamatLulusan;
    }

    public void setAsalAlamatLulusan(String asalAlamatLulusan) {
        this.asalAlamatLulusan = asalAlamatLulusan;
    }

    public Boolean getKerja() {
        return isKerja;
    }

    public void setKerja(Boolean kerja) {
        isKerja = kerja;
    }

    public String getKantorInstansi() {
        return kantorInstansi;
    }

    public void setKantorInstansi(String kantorInstansi) {
        this.kantorInstansi = kantorInstansi;
    }

    public String getKantorJabatan() {
        return kantorJabatan;
    }

    public void setKantorJabatan(String kantorJabatan) {
        this.kantorJabatan = kantorJabatan;
    }

    public String getKantorAlamat() {
        return kantorAlamat;
    }

    public void setKantorAlamat(String kantorAlamat) {
        this.kantorAlamat = kantorAlamat;
    }

    public String getKantorNotlp() {
        return kantorNotlp;
    }

    public void setKantorNotlp(String kantorNotlp) {
        this.kantorNotlp = kantorNotlp;
    }

    public String getBiayaRencana() {
        return biayaRencana;
    }

    public void setBiayaRencana(String biayaRencana) {
        this.biayaRencana = biayaRencana;
    }

    public String getBiayaSPB() {
        return biayaSPB;
    }

    public void setBiayaSPB(String biayaSPB) {
        this.biayaSPB = biayaSPB;
    }

    public String getBiayaSPP() {
        return biayaSPP;
    }

    public void setBiayaSPP(String biayaSPP) {
        this.biayaSPP = biayaSPP;
    }

    public String getSumberInfo() {
        return sumberInfo;
    }

    public void setSumberInfo(String sumberInfo) {
        this.sumberInfo = sumberInfo;
    }

    public String getpWawancara() {
        return pWawancara;
    }

    public void setpWawancara(String pWawancara) {
        this.pWawancara = pWawancara;
    }

    public String getPmbJurusan() {
        return pmbJurusan;
    }

    public void setPmbJurusan(String pmbJurusan) {
        this.pmbJurusan = pmbJurusan;
    }

    public String getPmbPerguruanTinggi() {
        return pmbPerguruanTinggi;
    }

    public void setPmbPerguruanTinggi(String pmbPerguruanTinggi) {
        this.pmbPerguruanTinggi = pmbPerguruanTinggi;
    }

    public Boolean getIsLunas() {
        return isLunas;
    }

    public void setIsLunas(Boolean lunas) {
        isLunas = lunas;
    }
}
