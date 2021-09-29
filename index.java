
import java.util.Arrays;

public class BubbleSort {
    int[] dest;

    public BubbleSort() {
        int[] zahlen = {7, 1, 5, 87, 13, 10, 38, -1};
        System.out.println(Arrays.toString(zahlen));
        sortieren(zahlen);
        System.out.println(Arrays.toString(zahlen));
        double n = median(zahlen);
        System.out.println(n);
        System.out.println();
        zahlen = wachsendesFeld(10);
        System.out.println(Arrays.toString(zahlen));
        System.out.println();
        int k = findeKleinere(zahlen, 20);
        System.out.println(k);
        System.out.println(Arrays.toString(dest));
   }

    public void sortieren(int[] a) {
        // Äußere Schleife, separiert unsortierten von sortiertem Bereich
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    swap(a, j, j+1);
                }
            }
        }

    }

    public double median(int[] a) {
        //sortieren(a);
        int index = (a.length - 1) / 2;
        return a.length % 2 == 0 ? (double) a[index] + ( (double) a[index+1]- (double) a[index] ) / 2 : (double) a[index];
    }

    public int[] wachsendesFeld(int anzahl) {
        int[] a = new int[anzahl];
        int n = (int) (Math.random() * 99) + 1;
        int t = 0;

        for (int i = 0; i < anzahl; i++) {
            t += i==0 ? 0 : (int) (Math.random() * 900 ) + 100;
            n += t;
            a[i] = n;
        }

        return a;
    }


    public int findeKleinere(int[] source, int t) {
        dest = new int[source.length];
        int k = 0;
        for (int i = 0; i < source.length ; i++) {
            if (source[i] < t) {
                dest[i] = source[i];
                k++;
            }
        }
        return k;
    }

    public int findeKleinereSortiert(int[] source, int[] dest, int t) {
        int n = 0;
        while(source[n] < t) {
            n++;
        }
        dest = new int[n];
        for (int i = 0; i < dest.length; i++) {
            dest[i] = source[i];
        }
        return n;
    }


    private void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) {
        new BubbleSort();
    }
}
