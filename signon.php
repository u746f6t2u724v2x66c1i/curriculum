<?php
declare(strict_types=1);

ini_set('session.use_cookies', 'true');
$secure_cookie = false;
session_set_cookie_params(0, '/', '', $secure_cookie, true);
$session_name = 'SignonSession';
session_name($session_name);
@session_start();

if (isset($_POST['user'])) {
    $_SESSION['PMA_single_signon_user'] = $_POST['user'];
    $_SESSION['PMA_single_signon_password'] = $_POST['password'];
    $_SESSION['PMA_single_signon_host'] = $_POST['host'];
    $_SESSION['PMA_single_signon_port'] = $_POST['port'];
    $_SESSION['PMA_single_signon_cfgupdate'] = ['verbose' => 'Signon test'];
    $_SESSION['PMA_single_signon_HMAC_secret'] = hash('sha1', uniqid(strval(random_int(0, mt_getrandmax())), true));
    $id = session_id();
    @session_write_close();
    header('Location: ../index.php');
} else {
    header('Content-Type: text/html; charset=utf-8');

    echo '<?xml version="1.0" encoding="utf-8"?>' . "\n";
    echo '<!DOCTYPE HTML>
<html lang="en" dir="ltr">
<head>
<link rel="icon" href="../favicon.ico" type="image/x-icon">
<link rel="shortcut icon" href="../favicon.ico" type="image/x-icon">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="utf-8">
<title>phpMyAdmin single signon example</title>
</head>
<body class="container py-5">';

    if (isset($_SESSION['PMA_single_signon_error_message'])) {
        echo '<div class="alert alert-danger">';
        echo $_SESSION['PMA_single_signon_error_message'];
        echo '</div>';
    }

    echo '<form action="signon.php" method="post">
<div class="mb-3">
<label for="user" class="form-label">Username:</label>
<input type="text" name="user" autocomplete="username" spellcheck="false" class="form-control" id="user">
</div>
<div class="mb-3">
<label for="password" class="form-label">Password:</label>
<input type="password" name="password" autocomplete="current-password" spellcheck="false" class="form-control" id="password">
</div>
<div class="mb-3">
<label for="host" class="form-label">Host: (will use the one from config.inc.php by default)</label>
<input type="text" name="host" class="form-control" id="host">
</div>
<div class="mb-3">
<label for="port" class="form-label">Port: (will use the one from config.inc.php by default)</label>
<input type="text" name="port" class="form-control" id="port">
</div>
<button type="submit" class="btn btn-primary">Submit</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9Dz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</body>
</html>';
}
?>
