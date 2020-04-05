package codewars.com;

public class User {

    public int rank = -8;
    public int progress = 0;

    public void incProgress(int rank) {
        if (Math.abs(rank)> 8 || rank == 0) {
            throw new IllegalArgumentException();
        }
        progress += updateProgress(rank);
        while (progress >= 100) {
            if (this.rank == -1) {
                this.rank = 0;
            }
            this.rank += 1;
            progress -= 100;
        }
        if (this.rank == 8) {
            progress = 0;
        }
    }

    private int updateProgress(int rank) {
        int val = 0;
        int inc = Math.abs(this.rank - rank);
        if ((this.rank < 0 && rank > 0) || (this.rank > 0 && rank < 0)) {
            inc -= 1;
        }
        if (this.rank < rank) {
            val = 10 * inc * inc;
        } else if (this.rank > rank) {
            val = 1;
        } else if (this.rank == rank) {
            val = 3;
        }
        return val;
    }

}
