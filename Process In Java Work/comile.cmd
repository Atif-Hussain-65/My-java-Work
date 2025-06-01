@echo off
setlocal
set "DIR=%~dp0"
cd /d "%DIR%"
javac ProcessExample.java
if %ERRORLEVEL% neq 0 (
    echo Compilation failed!
    exit /b
)
echo Compilation successful!
endlocal
