<?
require_once('class.phpmailer.php');

$mail = new PHPMailer(false);
$mail->IsSMTP();
$mail->Host       = "";
$mail->SMTPAuth   = false;
$mail->Host       = "";
$mail->Port       = 25;
$mail->SMTPKeepAlive = false;
$mail->AddAddress('', '');
$mail->SetFrom('', "");
$mail->Subject = "";
$mail->Body = '';
$mail->Send();





































/*
$mail             = new PHPMailer();
$mail->IsSMTP(); // telling the class to use SMTP
$mail->SMTPAuth   = true;                  // enable SMTP authentication
$mail->SMTPSecure = "ssl";                 // sets the prefix to the servier
$mail->Host       = "smtp.gmail.com";      // sets GMAIL as the SMTP server
$mail->Port       = 465;                   // set the SMTP port for the GMAIL server
$mail->Username   = "ppsfail@gmail.com";  // GMAIL username
$mail->Password   = "PPSSUXHARD";            // GMAIL password
$mail->SetFrom('you@win.com', 'You win lol');
$mail->Subject    = "So you think you can fuck with me?";
$mail->Body = "55 minutes late lol...";
$address = "marria.alexandrrova@gmail.com";
$mail->AddAddress($address, "You're fucked");
$file = fopen("log.txt", "wb");
while($mail->Send()) {
$time = date("Y-m-d H:i:s");
fwrite($file, "Mail sent!\n");
}
fclose($file);
*/

