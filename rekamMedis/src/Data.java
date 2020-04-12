/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiseka
 */
public class Data { //bersifat independen karna dia berupa objek
    int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) { //mengatur nilai id
        this.id = id;
    }

    public String getNama() { //mendapatkan nilai nama
        return nama;
    }

    public void setNama(String nama) { //mensetting nama
        this.nama = nama;
    }
    String nama;
}
