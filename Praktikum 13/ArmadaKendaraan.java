/*Nama      : Ahmad Muhammad Ghifar Hirawan */
/*Nim       : 24060122140160                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : ArmadaKendaraan.java          */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArmadaKendaraan <T extends Vehicle> {
    private List<T> armada = new ArrayList<>();

    public void tambahArmada(Collection<? extends T> kendaraanCollection) {
        armada.addAll(kendaraanCollection);
    }

    public List<T> getAllArmada() {
        return new ArrayList<>(armada);
    }
}