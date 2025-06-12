package com.synerset.unitility.spring.examples;

import com.synerset.unitility.unitsystem.common.Angle;
import com.synerset.unitility.unitsystem.common.Distance;
import com.synerset.unitility.unitsystem.common.Mass;
import lombok.Data;

@Data
public class MeshElement {
    /**
     * Id of the node.
     */
    private Integer Id;

    /**
     * Length of the node. Units: m.
     */
    private Distance length;

    /**
     * Azimuth of the node. Units: radians.
     */
    private Angle azimuth;

    /**
     * Mass of the node. Units: kg.
     */
    private Mass mass;
}