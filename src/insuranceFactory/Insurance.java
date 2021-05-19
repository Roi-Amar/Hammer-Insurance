package insuranceFactory;

import java.util.ArrayList;

public interface Insurance {
	ArrayList<InsuranceData> data = new ArrayList<InsuranceData>();
	public void insure();
	public default InsuranceData getData() {
		return Insurance.data.get(0);
	}
	public default void setData(String price) {
		Insurance.data.add(new InsuranceData(price));
	}
}