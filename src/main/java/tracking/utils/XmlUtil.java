package tracking.utils;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlUtil {

	public static String beanToString(Object bean) {
		try {
			JAXBContext context = JAXBContext.newInstance(bean.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

			StringWriter writer = new StringWriter();
			marshaller.marshal(bean, writer);
			String result = writer.toString();
			return result;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static <T> T stringToBean(String source, Class<? extends T> type) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(type);
			Unmarshaller um = jaxbContext.createUnmarshaller();
			T obj = (T) um.unmarshal(new ByteArrayInputStream(source.getBytes()));
			return obj;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
