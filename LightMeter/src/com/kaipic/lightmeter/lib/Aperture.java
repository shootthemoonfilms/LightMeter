package com.kaipic.lightmeter.lib;

import java.text.DecimalFormat;

public class Aperture {
  private float value;

  public Aperture(float value) {
    this.value = value;
  }

  public Aperture(ShutterSpeed shutterSpeed, ExposureValue ev) {
    this((float) Math.sqrt(shutterSpeed.getValue() * Math.pow(2d, ev.getValue())));
  }

  float getValue() {
    return value;
  }

  public static Aperture fromString(String value) {
    return new Aperture(Float.valueOf(value));
  }

  @Override
  public String toString() {
    if(value < 1.0)
      return new DecimalFormat("#.##").format(value);
    return new DecimalFormat("#.0").format(value);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Float.floatToIntBits(value);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Aperture other = (Aperture) obj;
    if (Float.floatToIntBits(value) != Float.floatToIntBits(other.value))
      return false;
    return true;
  }
}
