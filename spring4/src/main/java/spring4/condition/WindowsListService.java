package spring4.condition;
/**
 * windows�´�����bean
 * @author yrz
 *
 */
public class WindowsListService implements ListService{

	public String showListCmd() {
		return "dir";
	}

}
