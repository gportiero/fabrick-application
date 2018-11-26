package it.gportiero.fabrick.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Utils class to manage operations on enum
 * 
 * @author gaetano.portiero
 *
 */
public final class EnumUtils {

	/**
	 * 
	 * @param enumType
	 *            the type of Enum
	 * @param name
	 *            value of enum as string
	 * @return an instance of Enum or null if no enum constant present
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Enum<T>> T get(Class<T> enumType, String name) {
		if (!enumType.isEnum()) {
			return null;
		}

		try {
			Method method = enumType.getMethod("valueOf", String.class);
			return (T) method.invoke(enumType.getClass(), name);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// nothing to do
		}

		return null;
	}
}
