# HOL 2 - Git Ignore

## Objectives
- Understand `.gitignore`.
- Ignore unwanted files.

## Steps
```bash
touch debug.log
mkdir logs
touch logs/error.log
echo "*.log" > .gitignore
echo "logs/" >> .gitignore
git add .gitignore
git commit -m "Added gitignore to ignore logs"
git status
```
---
