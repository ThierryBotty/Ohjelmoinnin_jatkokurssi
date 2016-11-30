package luola;

public class Pelaaja {
    
    private int x;
    private int y;
    private int maxX;
    private int maxY;

    public Pelaaja(int leveys, int korkeus) {
        this.x = 0;
        this.y = 0;
        this.maxX = leveys;
        this.maxY = korkeus;
    }
    
    public void liiku(char c) {
        if (c == 'a') {
            this.x--;
            
        } else if (c == 's') {
            this.y++;
            
        } else if (c == 'd') {
            this.x++;
            
        } else if (c == 'w') {
            this.y--;
        }
        tarkistaOnkoRajojenUlkopuolelle();
    }

    private void tarkistaOnkoRajojenUlkopuolelle() {
        if (this.x < 0) {
            this.x = 0;
        }
        if (this.y < 0) {
            this.y = 0;
        }
        if (this.x == this.maxX) {
            this.x = maxX - 1;
        }
        if (this.y == this.maxY) {
            this.y = maxY - 1;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
