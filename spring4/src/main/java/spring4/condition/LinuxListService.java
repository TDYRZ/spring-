package spring4.condition;
/**
 * linux�´�����bean
 * @author yrz
 *
 */
public class LinuxListService implements ListService{

	public String showListCmd() {
		return "ls";
	}

}
