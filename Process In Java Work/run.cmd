@echo off
setlocal
set "DIR=%~dp0"
cd /d "%DIR%"
java ProcessExample
pause
endlocal
