# HOL 1 - Git Configuration and Notepad++ Integration

## Objectives
- Familiarize with Git commands like `git init`, `git status`, `git add`, `git commit`, `git push`, and `git pull`.
- Setup your machine with Git configuration.
- Integrate Notepad++ as the default editor for Git.
- Add a file to source code repository.

## Prerequisites
- Install Git Bash client on your machine.
- Install Notepad++.

## Steps

### Step 1: Setup Git Configuration
```bash
git --version
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
git config --list
```

### Step 2: Integrate Notepad++
- Check if Notepad++ is available from Git Bash:
```bash
notepad++
```
- If not recognized, add Notepad++ path to environment variables.

### Step 3: Create a Repository
```bash
mkdir GitDemo
cd GitDemo
git init
echo "Hello Git" > demo.txt
git add demo.txt
git commit -m "Initial commit"
git remote add origin <remote_repo_url>
git push -u origin master
```

---
