package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Order;

@Component
@Transactional
public class OrderToStringConverter implements Converter<Order,String>{

	@Override
	public String convert(Order order) {
		String result;
		
		if(order==null){
			result=null;
		}else{
			result=String.valueOf(order.getId());
		}
		return result;
	}

}
