Kiến thức em đã tìm hiểu về Health-Check-Spring-Boot

Tác dụng:
  +  Phát hiện lỗi sớm
  +  Hỗ trợ giám sát và cảnh báo
  +  Đảm bảo tính sẵn sàng của hệ thống

Khi một service được triển khai 1 service lên server kubernetes thì devops có thể view được trạng thái của các microService có liên quan tới service được deploy đó 
+ nếu service OK =>> trả ra status là UP

+ nếu service False =>> trả ra status là Down =>> lúc này sẽ có 2 cách để kiểm tra lỗi: 

=>> dùng liveness và readiness:
  
  - liveness dùng để kiểm tra hệ thống còn sống hay không, nếu không thì sẽ được build lại tới khi thành công thì thôi
                                                                   =>> dùng cho luồng quan trọng 
    
  - readiness dùng để kiểm tra service có sẵn sàng được sử dụng hay không, nếu không thì sẽ ngừng chuyển traffic tới container để build tổng thể
                                                                    =>> dùng cho những phần kh quan trọng hoặc gặp sự cố tạm thời


 Liveness Check & Readiness Check Luôn Chạy 
