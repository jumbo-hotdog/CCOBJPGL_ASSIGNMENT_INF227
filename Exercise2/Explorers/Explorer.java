package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Neptune;
import Planets.Pluto;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Neptune neptune);

    void visit(Pluto pluto);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
