package com.nt.beans;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Treatmentcharges {
	private Set<String> cardiologyTreatment;
	private Map<String, Float> cardiologytrtmntCharges;
	private Set<String> neurologyTreatment;
	private Map<String, Float> neurologytrtmntCharges;
	private Set<String> angiplastyTreatment;
	private Map<String, Float> angioplastytrtmntCharges;
	
	public Treatmentcharges() {
		System.out.println("Treatmentcharges.Treatmentcharges()");
	}
	
	public Set<String> getCardiologyTreatment() {
		return cardiologyTreatment;
	}
	public Map<String, Float> getCardiologytrtmntCharges() {
		return cardiologytrtmntCharges;
	}
	public Set<String> getNeurologyTreatment() {
		return neurologyTreatment;
	}
	public Map<String, Float> getNeurologytrtmntCharges() {
		return neurologytrtmntCharges;
	}
	public Set<String> getAngiplastyTreatment() {
		return angiplastyTreatment;
	}
	public Map<String, Float> getAngioplastytrtmntCharges() {
		return angioplastytrtmntCharges;
	}
	public void setCardiologyTreatment(Set<String> cardiologyTreatment) {
		this.cardiologyTreatment = cardiologyTreatment;
	}
	public void setCardiologytrtmntCharges(Map<String, Float> cardiologytrtmntCharges) {
		this.cardiologytrtmntCharges = cardiologytrtmntCharges;
	}
	public void setNeurologyTreatment(Set<String> neurologyTreatment) {
		this.neurologyTreatment = neurologyTreatment;
	}
	public void setNeurologytrtmntCharges(Map<String, Float> neurologytrtmntCharges) {
		this.neurologytrtmntCharges = neurologytrtmntCharges;
	}
	public void setAngiplastyTreatment(Set<String> angiplastyTreatment) {
		this.angiplastyTreatment = angiplastyTreatment;
	}
	public void setAngioplastytrtmntCharges(Map<String, Float> angioplastytrtmntCharges) {
		this.angioplastytrtmntCharges = angioplastytrtmntCharges;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Treatmentcharges [cardiologyTreatment="
				+ (cardiologyTreatment != null ? toString(cardiologyTreatment, maxLen) : null)
				+ ", cardiologytrtmntCharges="
				+ (cardiologytrtmntCharges != null ? toString(cardiologytrtmntCharges.entrySet(), maxLen) : null)
				+ ", neurologyTreatment=" + (neurologyTreatment != null ? toString(neurologyTreatment, maxLen) : null)
				+ ", neurologytrtmntCharges="
				+ (neurologytrtmntCharges != null ? toString(neurologytrtmntCharges.entrySet(), maxLen) : null)
				+ ", angiplastyTreatment="
				+ (angiplastyTreatment != null ? toString(angiplastyTreatment, maxLen) : null)
				+ ", angioplastytrtmntCharges="
				+ (angioplastytrtmntCharges != null ? toString(angioplastytrtmntCharges.entrySet(), maxLen) : null)
				+ "]";
	}

	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
			if (i > 0)
				builder.append(", ");
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
	}

}
