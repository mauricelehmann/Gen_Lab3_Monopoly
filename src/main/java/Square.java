

public class Square {

    private String name;
    private int id;

    public Square(int id, String name){
        this.name = name;
        this.id = id;
    }

    /**
     * Get the id of the square
     * @return id as int
     */
    public String getName() {
        return name;
    }

    public int getId(){
        return this.id;
    }

}
