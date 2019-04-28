package spring4.condition;
/**
 * windows下创建的bean
 * @author yrz
 *
 */
public class WindowsListService implements ListService{

	public String showListCmd() {
		return "dir";
	}

}
