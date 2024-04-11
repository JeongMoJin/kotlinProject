package ch_01.day240118;

import java.util.Scanner;

public class KoreaItTest {
    private static final int max = 3;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Account[] accounts = new Account[max]; // 0 1 2 가능
    private static int idx = 0;

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1 -> createAccount();
                case 2 -> viewAccountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> viewAccount();
                case 6 -> run = false;
                default -> System.out.println("다시 입력해주세요");
            }
        }
        System.out.println("프로그램 종료");
    }

    public static void createAccount() {
        if (idx < max) {
            System.out.println("--------------");
            System.out.println("계좌생성");
            System.out.println("--------------");

            System.out.print("계좌번호: ");
            String ano = scanner.next();

            System.out.print("계좌주: ");
            String owner = scanner.next();

            System.out.print("초기입금액: ");
            int balance = scanner.nextInt();

            Account account = new Account(ano, owner, balance);
            accounts[idx] = account;
            System.out.println("결과: 계좌가 생성되었습니다.");
            idx++;
        } else {
            System.out.println("생성 가능한 계좌의 범위를 초과했습니다.");
        }
    }

    public static void viewAccountList() {
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");
        for (int i = 0; i < idx; i++) {
            if (accounts[i] != null) {
                System.out.print(accounts[i].getAno());
                System.out.print(" ");
                System.out.print(accounts[i].getOwner());
                System.out.print(" ");
                System.out.print(accounts[i].getBalance());
                System.out.println();
            } else {
                break;
            }
        }
    }

    public static void deposit() {
        System.out.println("----------------");
        System.out.println("예금");
        System.out.println("----------------");
        System.out.print("계좌번호: ");
        String searchAno = scanner.next();
        Account account = findAccount(searchAno);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
        } else {
            System.out.println("예금액: ");
            int plusBalance = scanner.nextInt();
            if (plusBalance > 0) {
                account.setBalance(account.getBalance()+plusBalance);
                System.out.println("결과: 예금이 성공되었습니다.");
            } else {
                System.out.println("0원 이상만 입금가능합니다.");
            }
        }
    }

    public static void withdraw() {
        System.out.println("----------------");
        System.out.println("출금");
        System.out.println("----------------");
        System.out.print("계좌번호: ");
        String searchAno = scanner.next();
        Account account = findAccount(searchAno);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
        } else {
            System.out.println("출금액: ");
            int minusBalance = scanner.nextInt();
            if (minusBalance < 0) {
                System.out.println("0원 이상만 출금가능합니다.");
            } else if (minusBalance > account.getBalance()){
                System.out.println("결과: 잔액보다 출금액이 커서 출금에 실패했습니다.");
            }else {
                account.setBalance(account.getBalance()-minusBalance);
                System.out.println("결과: 출금이 성공되었습니다.");
            }
        }
    }

    public static void viewAccount() {
        System.out.println("----------------");
        System.out.println("조회");
        System.out.println("----------------");
        System.out.print("계좌번호: ");
        String searchAno = scanner.next();
        Account account = findAccount(searchAno);
        if (account != null) {
            System.out.print(account.getAno());
            System.out.print(" ");
            System.out.print(account.getOwner());
            System.out.print(" ");
            System.out.print(account.getBalance());
            System.out.println();
        } else {
            System.out.println("결과: 계좌가 없습니다.");
        }
    }
    private static Account findAccount(String searchAno) {
        Account account = null;
        for (int i = 0; i < idx; i++) {
            if (accounts[i] != null) {
                if (accounts[i].getAno().equals(searchAno)) {
                    account = accounts[i];
                    break;
                }
            } else {
                break;
            }
        }
        return account;
    }
}
// if 문 말고 스위치 표현식(스위치문x 화살표) 메인 메서드에 기입
// 객체 생성 클래스 제공
// case3 (count) 처럼 idx 활용
// tip : 에러 메세지 + 출력 글자까지 똑같이 맞추기