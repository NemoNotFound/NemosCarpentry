path=$1
oldName=$2
newName=$3

cd $path

for f in *
do
  mv "$f" "$(echo "$f" | sed s/$oldName/$newName/)"
done

echo "Renamed all pictures"
