package com.lynda.olivepress.press;
import java.util.Collection;
import com.lynda.olivepress.olives.Olive;

public interface press {
	public void getOil(Collection<Olive> olives);
	public int getTotalOil();
	public void setTotalOil(int totalOil);
}
