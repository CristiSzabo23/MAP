public class CatalogUniversitate {

    public int[] noteInsuficiente(int[] note) {
        int numarPicati = 0;
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 40) {
                numarPicati++;
            }
        }

        int[] rezultat = new int[numarPicati];
        int index = 0;

        for (int i = 0; i < note.length; i++) {
            if (note[i] < 40) {
                rezultat[index] = note[i];
                index++;
            }
        }
        return rezultat;
    }

    public double mediaNotelor(int[] note) {
        double suma = 0;
        for (int i = 0; i < note.length; i++) {
            suma = suma + note[i];
        }
        return suma / note.length;
    }

    public int rotunjesteNota(int nota) {
        if (nota < 38) {
            return nota;
        }

        int urmatorulMultiplu = nota;
        while (urmatorulMultiplu % 5 != 0) {
            urmatorulMultiplu++;
        }

        if (urmatorulMultiplu - nota < 3) {
            return urmatorulMultiplu;
        }

        return nota;
    }

    public int[] noteRotunjite(int[] note) {
        int[] rezultat = new int[note.length];

        for (int i = 0; i < note.length; i++) {
            rezultat[i] = rotunjesteNota(note[i]);
        }

        return rezultat;
    }

    public int notaMaxima(int[] note) {
        int max = 0;

        for (int i = 0; i < note.length; i++) {
            int notaCurenta = rotunjesteNota(note[i]);

            if (notaCurenta > max) {
                max = notaCurenta;
            }
        }

        return max;
    }
}