package lgs;

import java.util.ArrayList;
import java.util.List;

public class Mainn {

    public static void addToList(List list) {list.add(67);list.add("String");}
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(76);
        //list.add("String"); �� �������
    
        addToList(list);
        /* ϳ� ��� ��������� ��������� ������������� ���� ����������, 
         * ��� �� List <Integer> ��� List, 
         * � ����� ������ �� ����� ����-���� ����������� ���.
         */
        
        System.out.println(list);
    }  
}