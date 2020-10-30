package ac.id.sttistieni.restservice.entity;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tt_user_pmb")
@EntityListeners(AuditingEntityListener.class)
public class MahasiswaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @NotBlank
    @Column(name = "id_pmb_user")
    private String id_user;

    @NotBlank
    @Column(name = "pmb_username")
    private String username;

    @NotBlank
    @Column(name = "pmb_password")
    private String password;

    @NotBlank
    @Column(name = "pmb_email")
    private String email;

    @Column(name = "pmb_fullname")
    private String fullname;

    @Column(name = "pmb_kelamin")
    private String kelamin;

    @Column(name = "pmb_tempatlahir")
    private String tempatLahir;

    @Column(name = "pmb_tgllahir")
    private Date tglLahir;

    @Column(name = "pmb_ibukandung")
    private String ibuKandung;

    @Column(name = "pmb_alamat")
    private String alamat;

    @Column(name = "pmb_kodepos")
    private String kodepos;
    @Column(name = "pmb_notlp")
    private String notlp;
    @Column(name = "pmb_lulusan")
    private String lulusan;
    @Column(name = "pmb_asal_lulusan")
    private String asalLulusan;
    @Column(name = "pmb_asal_jurusan")
    private String asalJurusan;
    @Column(name = "pmb_asal_alamat_sekolah")
    private String asalAlamatLulusan;
    @Column(name = "pmb_iskerja")
    private Boolean isKerja = false;
    @Column(name = "pmb_kantor_instansi")
    private String kantorInstansi;
    @Column(name = "pmb_kantor_jabatan")
    private String kantorJabatan;
    @Column(name = "pmb_kantor_alamat")
    private String kantorAlamat;
    @Column(name = "pmb_kantor_notelp")
    private String kantorNotlp;
    @Column(name = "pmb_biaya_rencdari")
    private String biayaRencana;
    @Column(name = "pmb_biaya_spb")
    private String biayaSPB;
    @Column(name = "pmb_biaya_spp")
    private String biayaSPP;
    @Column(name = "pmb_sumber_info")
    private String sumberInfo;
    @Column(name = "pmb_wawancara")
    private String pWawancara;
    @Column(name = "pmb_jurusan")
    private String pmbJurusan;
    @Column(name = "pmb_perguruan_tinggi")
    private String pmbPerguruanTinggi;
    @Column(name = "pmb_islunas")
    private Boolean isLunas = false;

    public MahasiswaEntity() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Boolean getIsKerja() {
        return isKerja;
    }

    public void setIsKerja(Boolean kerja) {
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
