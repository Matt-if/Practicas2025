#! /bin/bash

set -euo pipefail

echo "agregando archivos al staging area..."
git add .

echo "creando commit..."
git commit -m "Fecha: $(date +%Y-%m-%d) Hora: $(date +%H:%M:%S)"

echo "subiendo cambios al repositorio remoto..."
git push

echo "cambios subidos exitosamente."
