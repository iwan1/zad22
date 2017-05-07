package zad22;

public class Sortowanko implements Comparable<Sortowanko>{
    private String linia;
    
    public Sortowanko(String a){
        linia = a;
    }
    
    public String getLinia(){
        return linia;
    }
    
    public void setLinia(String linia){
        this.linia = linia;
    }
    

    public int compareTo(Sortowanko o) {
        return linia.compareTo(o.getLinia());
    }
    
    public String toString(){
        return linia;
    }
    
    
}