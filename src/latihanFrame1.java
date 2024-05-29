public class latihanFrame1 {
    private String nip;
    private String nama;
    private String golongan;
    private String jabatan;
    private double gapok;
    private double tunjangan;
    private double total;

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void setNip(String nip) {
        this.nip = nip;
        this.nama = getNamaByNim(nip);
    }

    public String getGolongan() {
        return golongan;
    }

    public Double getGapok(){
        return gapok;
    }

    public Double getTunjangan(){
        return tunjangan;
    }

    public Double getTotal(){
        return total;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
        this.jabatan = getJabatanByGolongan(golongan);
        this.gapok = getGapokByGolongan(golongan);
        this.tunjangan = getTunjanganByGolongan(golongan);
        this.total = (gapok+tunjangan);
    }

    public String getJabatanByGolongan(String golongan) {
        switch(golongan) {
            case "1" : return "Direktur";
            case "2" : return "Manager";
            case "3" : return "Kabag";
            default : return "Golongan Tidak Diketahui";
        }

    }

    public String getNamaByNim(String nip) {
        switch(nip){
            case "200803735" : return "Muhammad";
            case "200803736" : return "Abdul Aziz";
            case "200803737" : return "Suhair";
            case "200803738" : return "Ibrahim";
            case "200803739" : return "Arhan";
            default : return "Unknown";
        }
    }
    
    public Double getGapokByGolongan(String golongan){
        switch(golongan) {
            case "1" : return 3000000.00;
            case "2" : return 2000000.00;
            case "3" : return 1500000.00;
            default : return 0.00;
        }
    }

    public Double getTunjanganByGolongan(String golongan){
        switch(golongan) {
            case "1" : return 1000000.00;
            case "2" : return 500000.00;
            case "3" : return 3000000.00;
            default : return 0.00;
        }
    }
    
    
}
