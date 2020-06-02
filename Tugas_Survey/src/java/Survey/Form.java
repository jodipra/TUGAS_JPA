/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Survey;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HZ
 */
@Entity
@Table(name = "form")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Form.findAll", query = "SELECT f FROM Form f")
    , @NamedQuery(name = "Form.findById", query = "SELECT f FROM Form f WHERE f.id = :id")
    , @NamedQuery(name = "Form.findByNamaLengkap", query = "SELECT f FROM Form f WHERE f.namaLengkap = :namaLengkap")
    , @NamedQuery(name = "Form.findByJenisKelamin", query = "SELECT f FROM Form f WHERE f.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Form.findByAlamat", query = "SELECT f FROM Form f WHERE f.alamat = :alamat")
    , @NamedQuery(name = "Form.findByTelp", query = "SELECT f FROM Form f WHERE f.telp = :telp")
    , @NamedQuery(name = "Form.findByJurusan", query = "SELECT f FROM Form f WHERE f.jurusan = :jurusan")
    , @NamedQuery(name = "Form.findByMinat", query = "SELECT f FROM Form f WHERE f.minat = :minat")})
public class Form implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "Nama_Lengkap")
    private String namaLengkap;
    @Size(max = 50)
    @Column(name = "Jenis_Kelamin")
    private String jenisKelamin;
    @Size(max = 100)
    @Column(name = "Alamat")
    private String alamat;
    @Size(max = 25)
    @Column(name = "Telp")
    private String telp;
    @Size(max = 50)
    @Column(name = "Jurusan")
    private String jurusan;
    @Size(max = 50)
    @Column(name = "Minat")
    private String minat;

    public Form() {
    }

    public Form(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getMinat() {
        return minat;
    }

    public void setMinat(String minat) {
        this.minat = minat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Form)) {
            return false;
        }
        Form other = (Form) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Survey.Form[ id=" + id + " ]";
    }
    
}
