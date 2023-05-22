package dy0522;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class AddrGUI extends JFrame {
    private ArrayList<Addr> addlist;
    private JList<String> addrList;
    private JTextField nameField;
    private JTextField telField;
    private JTextField comField;

    public static void main(String[] args) {
        AddrGUI frame = new AddrGUI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    public AddrGUI() {
        addlist = new ArrayList<>();

        setTitle("주소록 관리");

        // 주소록 입력 패널
        JPanel inputPanel = new JPanel(new BorderLayout());
        JPanel inputGrid = createInputGrid();
        JButton addButton = new JButton("주소록 입력");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrInput();
            }
        });
        inputPanel.add(inputGrid, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.SOUTH);

        // 주소록 목록 패널
        JPanel listPanel = new JPanel(new BorderLayout());
        addrList = new JList<>();
        addrList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(addrList);
        listScrollPane.setPreferredSize(new Dimension(200, 200));
        listPanel.add(listScrollPane, BorderLayout.CENTER);

        // 주소록 조회, 삭제, 수정 버튼
        JPanel buttonPanel = new JPanel();
        JButton searchButton = new JButton("주소록 검색");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrSearch();
            }
        });
        JButton deleteButton = new JButton("주소록 삭제");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrDelete();
            }
        });
        JButton updateButton = new JButton("주소록 수정");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrUpdate();
            }
        });
        JButton viewAllButton = new JButton("주소록 전체 조회");
        viewAllButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrJohoi();
            }
        });
        buttonPanel.add(searchButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(viewAllButton);

        // 전체 패널
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.WEST);
        mainPanel.add(listPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        getContentPane().add(mainPanel);
    }

    private JPanel createInputGrid() {
        JPanel gridPanel = new JPanel(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("이름");
        nameField = new JTextField();
        JLabel telLabel = new JLabel("전화번호");
        telField = new JTextField();
        JLabel comLabel = new JLabel("회사명");
        comField = new JTextField();

        gridPanel.add(nameLabel);
        gridPanel.add(nameField);
        gridPanel.add(telLabel);
        gridPanel.add(telField);
        gridPanel.add(comLabel);
        gridPanel.add(comField);

        return gridPanel;
    }

    private void addrInput() {
        String name = nameField.getText();
        String tel = telField.getText();
        String com = comField.getText();
        LocalDateTime date = LocalDateTime.now();

        if (name.isEmpty() || tel.isEmpty() || com.isEmpty()) {
            JOptionPane.showMessageDialog(this, "모든 필드를 입력해주세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Addr add1 = new Addr(name, tel, com, date);
        addlist.add(add1);

        nameField.setText("");
        telField.setText("");
        comField.setText("");

        updateAddrList();
    }

    private void addrSearch() {
        String name = JOptionPane.showInputDialog(this, "검색할 이름을 입력하세요.");

        if (name == null || name.isEmpty()) {
            return;
        }

        ArrayList<Addr> searchResults = new ArrayList<>();
        for (Addr addr : addlist) {
            if (addr.getName().equals(name)) {
                searchResults.add(addr);
            }
        }

        if (searchResults.isEmpty()) {
            JOptionPane.showMessageDialog(this, "검색 결과가 없습니다.", "검색 결과", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder sb = new StringBuilder();
            for (Addr addr : searchResults) {
                sb.append(addr.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString(), "검색 결과", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void addrDelete() {
        int selectedIndex = addrList.getSelectedIndex();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "주소록을 선택해주세요.", "삭제 오류", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Addr addr = addlist.get(selectedIndex);
        int option = JOptionPane.showConfirmDialog(this, "선택한 주소록을 삭제하시겠습니까?", "주소록 삭제", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            addlist.remove(selectedIndex);
            updateAddrList();
        }
    }

    private void addrUpdate() {
        int selectedIndex = addrList.getSelectedIndex();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "주소록을 선택해주세요.", "수정 오류", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Addr addr = addlist.get(selectedIndex);

        String tel = JOptionPane.showInputDialog(this, "수정할 전화번호를 입력하세요.", addr.getTel());
        if (tel == null) {
            return;
        }

        String com = JOptionPane.showInputDialog(this, "수정할 회사명을 입력하세요.", addr.getCom());
        if (com == null) {
            return;
        }

        addr.setTel(tel);
        addr.setCom(com);

        updateAddrList();
    }

    private void addrJohoi() { 
        StringBuilder sb = new StringBuilder();
        for (Addr addr : addlist) {
            sb.append(addr.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(this, sb.toString(), "주소록 전체 조회", JOptionPane.INFORMATION_MESSAGE);
    }

    private void updateAddrList() {
        String[] names = new String[addlist.size()];
        for (int i = 0; i < addlist.size(); i++) {
            names[i] = addlist.get(i).getName();
        }
        addrList.setListData(names);
    }
}
