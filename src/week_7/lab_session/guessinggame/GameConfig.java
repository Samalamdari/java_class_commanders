package week_7.lab_session.guessinggame;

public class GameConfig {

    // Attributes
    private int min;
    private int max;

    // Constructor
    public GameConfig( int min, int max ) {
        setMin(min);
        setMax(max);
    }

    // Getters
    public int getMin() { return this.min; }
    public int getMax() { return this.max; }

    private void setMin(int min) { this.min = min; }
    private void setMax(int max) { this.max = max; }

}
