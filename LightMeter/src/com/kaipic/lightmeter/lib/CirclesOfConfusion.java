package com.kaipic.lightmeter.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CirclesOfConfusion {
  private static final List<CirclesOfConfusion> values = new ArrayList<CirclesOfConfusion>();

  public final static CirclesOfConfusion NIKON_ONE = new CirclesOfConfusion(new Length(0.011f), "Nikon 1 series");
  public final static CirclesOfConfusion BMCC_M43 = new CirclesOfConfusion(new Length(0.013f), "Blackmagic Cinema Camera MFT");
  public final static CirclesOfConfusion FOUR_THIRDS = new CirclesOfConfusion(new Length(0.015f), "Micro 4/3 (M43)");
  public final static CirclesOfConfusion BMPC = new CirclesOfConfusion(new Length(0.016f), "Blackmagic Production Camera 4K");
  public final static CirclesOfConfusion APS_C = new CirclesOfConfusion(new Length(0.018f), "APS-C Canon/Generic");
  public final static CirclesOfConfusion APS_C_NIKON = new CirclesOfConfusion(new Length(0.019f), "APS-C Nikon/Pentax/Sony");
  public final static CirclesOfConfusion APS_H = new CirclesOfConfusion(new Length(0.023f), "APS-H Canon");
  public final static CirclesOfConfusion FULL_FRAME_35MM = new CirclesOfConfusion(new Length(0.029f), "35mm Full-frame");
  public final static CirclesOfConfusion MF6x45 = new CirclesOfConfusion(new Length(0.047f), "Medium Format 6x4.5");
  public final static CirclesOfConfusion MF6x6 = new CirclesOfConfusion(new Length(0.053f), "Medium Format 6x6");
  public final static CirclesOfConfusion MF6x7 = new CirclesOfConfusion(new Length(0.059f), "Medium Format 6x7");
  public final static CirclesOfConfusion MF6x17 = new CirclesOfConfusion(new Length(0.12f), "Medium Format 6x17");
  public final static CirclesOfConfusion LF4x5 = new CirclesOfConfusion(new Length(0.11f), "Large Format 4x5");
  public final static CirclesOfConfusion LF5x7 = new CirclesOfConfusion(new Length(0.15f), "Large Format 5x7");
  public final static CirclesOfConfusion LF8x10 = new CirclesOfConfusion(new Length(0.22f), "Large Format 8x10");

  private final String stringValue;
  private final Length value;
  public static CirclesOfConfusion defaultCirclesOfConfusion = FULL_FRAME_35MM;

  private CirclesOfConfusion(Length value, String stringValue) {
    this.value = value;
    this.stringValue = stringValue;
    values.add(this);
  }

  public String toString() {
    return stringValue;
  }

  public Length getValue() {
    return value;
  }

  public static CirclesOfConfusion[] values() {
    return Collections.unmodifiableList(values).toArray(new CirclesOfConfusion[0]);
  }
}
